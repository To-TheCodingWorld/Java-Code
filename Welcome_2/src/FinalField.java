public class FinalField {

    final int noOfWheels ;
    final String modelNo;
    final  String engineLiters;


    public FinalField(int noOfWheels, String modelNo, String engineLiters) {
        this.noOfWheels = noOfWheels;
        this.modelNo = modelNo;
        this.engineLiters = engineLiters;
    }

    @Override
    public String toString() {
        return "FinalField{" +
                "noOfWheels=" + noOfWheels +
                ", modelNo='" + modelNo + '\'' +
                ", engineLiters='" + engineLiters + '\'' +
                '}';
    }

    public static void main(String[] args) {
        FinalField sc = new FinalField(4,"DXX453","25");
        System.out.println(sc);
    }

}
