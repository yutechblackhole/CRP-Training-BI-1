import java.util.*;


class TravelAgency{

    private int regno;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;



    TravelAgency(
        int regno, String agencyName, String packageType, int price, boolean flightfFacility
    )
    {
        this.regno = regno;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }


    public int getRegno(){
        return this.regno;
    }
    public void setRegno(int r){
        this.regno = r;
    }

    public String getAgencyName(){
        return this.agencyName;
    }
    public void setAgencyName(String a){
        this.agencyName = a;
    }

    public String getPackageName(){
        return this.packageName;
    }
    public void setPackageName(String p){
        this.packageName = p;
    }

    public int getPrice(){
        return this.price;
    }
    public void setPrice(int pp){
        this.price = pp;
    }

    public boolean isFlightFacility(){
        return this.flightFacility;
    }
    public void setFlightFacility(boolean f){
        this.flightfacility = f;
    }

}




public class TravelAgencySolution{

    static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr){
        int max = 0;
        for(TravelAgencies agency : arr){
        if(agency.getPrice()>max){
            max = agency.getPrice();

        }
        }
        return max;

    }

    static TravelAgencies agencyDetailesforGivenIdAndType(TravelAgencies[] arr, int regno, String packageType){

        for(TravelAgnecies agency : arr){
            if(agency.isFlightFacility() && agency.getRegno()==regno && agency.getPackageType().equalsIgnoreCase(packageType))
            {
                return agency;
            }
        }
        return null;
    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        

        int l;
        System.out.println("How many agencies are there?");
        l = sc.nextInt();

        for(int i =0; i <l; i++){
            int regno = sc.nextInt();
            sc.nextLine();
            String agencyName = sc.nextLine();
            String.packageType = sc.nextLine();
            int price = sc.nextInt();
            boolean flightFacility = sc.nextBoolean();



            Travel agency = new TravelAgencies(regno, agencyName, packageType, price, flightFacility);
            arr[i] = agency;
        }


          int regno = sc.nextInt();
          sc.nextLine();
          String packageType = sc.nextLine();


          System.out.println("___________________\n OUTPUT \n___________________");

          int maxprice = findAgencyWithHighestPAckagePrice(arr);
          TravelAgencies agency = agencyDetailesforGivenIdAndType(arr,regno, packageType);
          System.out.println(maxprice);

          if(agency != null){
          System.out.println(agency.getAgencyName()+":"+ agency.getPrice());
        }
        

    }
}