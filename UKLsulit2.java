import java.util.HashSet;

public class UKLsulit2 {
    public static void main(String[] args) {
    int array[]={1,2,3,4,2,5};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

    for (int num : array) {
        if (seen.contains(num)) {
            duplicates.add(num);
                } else {
                    seen.add(num);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("Array tidak memiliki elemen duplikat.");
        } else {
            System.out.print("Array memiliki elemen duplikat: " + duplicates);
    }
}
}
