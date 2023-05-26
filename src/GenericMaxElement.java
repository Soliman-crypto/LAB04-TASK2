import java.util.Comparator;



public class GenericMaxElement


{
    public static <T> T FindTheMaxElement(T[] array, Comparator<T> comparator)

    {
        if (array == null || array.length == 0)

        {
            throw new IllegalArgumentException(    "Array cannot be null or empty"   );
        }



        T maxElement = array[0];



        for (int i = 1; i < array.length; i++) {



            if (comparator.compare(array[i], maxElement) > 0) {
                maxElement = array[i];
            }
        }


        return maxElement;
    }

}
