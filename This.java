public class This {
    int var;
    This(int var){
        int b = var;
                this.var =  b ;
        System.out.println("This reference: "+this);
    }
    //this keyword le chai object reference lai point garxa
    
    public static void main(String[] args) {
        This obj = new This(10);
        //yesma this le chai object reference lai point garxa

        System.out.println("Object reference: "+obj);
        System.out.println("Variable refernce: "+obj.var);
        This obj2 = new This(20);
        System.out.println("variable reference: "+obj2.var);
        System.out.println("Object reference: "+obj2);
    }
}
