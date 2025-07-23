package pattern.responsibility.Approve;

public class Employee extends Approver{
    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= 1000) {
            System.out.println("员工审批采购单 #" + request.getId() + "，金额：" + request.getAmount());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);  // 传递给下一级
        }
    }
}
