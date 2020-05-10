package xyz.dev.vo;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class CheckVO implements Serializable {

    private Date checkIn;
    private Date checkOut;
    private ClientVO clientVO;
    private ArrayList<ExpenseVO> listExpense;

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public ClientVO getClientVO() {
        return clientVO;
    }

    public void setClientVO(ClientVO clientVO) {
        this.clientVO = clientVO;
    }

    public ArrayList<ExpenseVO> getListExpense() {
        return listExpense;
    }

    public void setListExpense(ArrayList<ExpenseVO> listExpense) {
        this.listExpense = listExpense;
    }
}
