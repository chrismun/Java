 public static int[] selectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallNum = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallNum;
        }
        return arr;
    }
