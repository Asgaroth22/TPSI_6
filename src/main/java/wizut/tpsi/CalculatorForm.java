package wizut.tpsi;
public class CalculatorForm {
    private Integer lvalue;
    private Integer rvalue;
    private String operation;

    public Integer getLvalue() {
        return lvalue;
    }

    public Integer getRvalue() {
        return rvalue;
    }

    public String getOperation() {
        return operation;
    }
    
     public void setLvalue(Integer lvalue) {
        this.lvalue = lvalue;
    }

    public void setRvalue(Integer rvalue) {
        this.rvalue = rvalue;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
    
    public Integer getResult(){
        Integer result = 0;
        if (this.operation.equals("+"))  result = this.lvalue + this.rvalue;
        if (this.operation.equals("-"))  result = this.lvalue - this.rvalue;
        if (this.operation.equals("*"))  result = this.lvalue * this.rvalue;
        return result;
    }
}
