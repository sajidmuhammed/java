import java.util.Arrays;
    public class Bubblesort<T>
    {
        T[] array;
        public static<T extends Comparable> void sort(T[] array)
        {
            for(int i = array.length; i > 1; i--)
            {
                for(int j = 0; j < i - 1; j++)
                {
                    if(array[j].compareTo(array[j+1]) > 0)
                    {
                        T temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
            System.out.println("Sorted array- " + Arrays.toString(array));
            //System.out.println("Sorted array- " + array);

        }
        public static void main(String[] args)
        { Integer[] arr = {20,100,30,10,80,66};
            Bubblesort<Integer> obj = new Bubblesort<Integer>();
            obj.sort(arr);
            String[] arr2 = {"Siyah","Athira","Minion","Anjali","Revu","Archana","Sreejith"};
            Bubblesort<String> obj2 = new Bubblesort<String>();
            obj2.sort(arr2);
        }
    }
 
