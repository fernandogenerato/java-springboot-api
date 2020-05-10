package xyz.dev.service;


import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.dev.entity.ClientEntity;
import xyz.dev.repository.ClientRepository;
import xyz.dev.vo.ClientVO;

@Service
public class ClientService {

    private Logger logger;
    @Autowired
    private ClientRepository clientRepository;

    private ClientEntity clientEntity;
    private ClientEntity.ClientPKEntity clientPKEntity;


    public void createClient(ClientVO clientVO) {
        try {
            clientEntity = new ClientEntity();
            clientPKEntity = new ClientEntity().new ClientPKEntity(clientVO.getDocument());
            clientEntity.setCellphone(clientVO.getCellphone());
            clientEntity.setMail(clientVO.getMail());
            clientEntity.setName(clientVO.getName());
            clientRepository.save(clientEntity);
            logger.info("[ClientService]  : createClient: " + clientVO.getName() + "salvo com sucesso ");
        } catch (Exception e) {
            logger.error(">>>>>>>>>>> :", e.getMessage());
        }

    }
}

