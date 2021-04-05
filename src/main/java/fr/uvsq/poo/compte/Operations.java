package fr.uvsq.poo.compte;


public enum Operations {

    PLUS("+") {
        public Integer oper (Integer x, Integer y){
            return x + y;
        }

    },

    MOINS("-") {
        public Integer oper (Integer x, Integer y){
            return x - y;
        }

    },
    MULT("*"){

        public Integer oper(Integer x, Integer y) {
            return x * y;
        }

    },

    DIV("/"){

        public Integer oper(Integer x, Integer y) {
            if(y == 0) {
                //throw new DivisionParZeroException();
            }
            return x / y;
        }

    };
    private String operande;

    private Operations(String operande) {
        this.operande = operande;
    }
    public abstract Integer oper(Integer x , Integer y);
    public String getOperande() {
        return operande;
    }

}