package CashRegisterDrawer;

public interface ICashRegisterDrawer {
    
    DrawerStatus getDrawerStatus();
    void Open();
    void Close();
    boolean isOpen();
    boolean isClosed();
       
}
