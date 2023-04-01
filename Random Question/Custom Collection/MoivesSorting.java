import java.util.Arrays;
import java.util.Comparator;

public class Details{
    int date;
    int rating;
    String name;

    public Details(int date, int rating, String name) {
        this.date = date;
        this.name = name;
        checkRating(rating);
    }

    void checkRating(int rating){
        if(rating<=0) this.rating = 0;
        else if(rating >10) this.rating = 10;
        else this.rating = rating;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Movies{
    public Details[] arr;

    public Movies(Details[] arr) {
        this.arr = arr;
    }

    void sortAlphabetically(){
        Arrays.sort(arr, new Comparator<Details>() {
            @Override
            public int compare(Details o1, Details o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    void sortRatingLowHigh(){
        Arrays.sort(arr, new Comparator<Details>() {
            @Override
            public int compare(Details o1, Details o2) {
                return o1.getRating()-o2.getRating();
            }
        });
    }
    void sortRatingHighLow(){
        Arrays.sort(arr, new Comparator<Details>() {
            @Override
            public int compare(Details o1, Details o2) {
                return o2.getRating()-o1.getRating();
            }
        });
    }

    void sortYear(){
        Arrays.sort(arr,((o1, o2) -> o2.getDate()-o1.getDate()));
    }


}
class Run{
    public static void main(String[] args) {

        Details[] arr= new Details[]{new Details(2012,4,"Veer"), new Details(2016, 11,"Charlie"), new Details(1997, 5,"Sadak")};
        Movies Movies =  new Movies(arr);

        Movies.sortYear();
        for(Details i : arr) System.out.println(i.name+" "+i.rating);
    }
}
