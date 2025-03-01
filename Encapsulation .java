class Encapsulation {
    private String data;

    void setData(String data) {
        this.data = data;
    }

    String getData() {
        return data;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setData("Encapsulation Example");
        System.out.println("Stored Data: " + obj.getData());
    }
}
