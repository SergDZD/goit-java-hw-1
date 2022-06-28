public static boolean isPalindrom(int n){
    int inNumber = n;
    int outNumber = 0;
    while (n >= 1){
        outNumber = outNumber * 10 + n % 10;
        n /= 10;
    }
    return inNumber == outNumber;
}

public static int[] gnome(int[] array, int day) {
    int numbLast = 0;
    int numbFirst = 0;
    int numbMidllePrev = array[0];
    int numbMidlleCurrent = array[0];
    while (day > 0){
        //if (numbFirst == array[1]) array[0] = 1;
        //else array[0] = 0;
        array[0] = (~(numbFirst ^ array[1]) & 1);//закомментировать, если используется if
        for (int i = 2; i < array.length; i++) {
            numbMidlleCurrent = array[i - 1];
            //if (numbMidllePrev == array[i]) array[i - 1] = 1;
            //else array[i - 1] = 0;
            array[i - 1] = (~(numbMidllePrev ^ array[i]) & 1);//закомментировать, если используется if
            numbMidllePrev = numbMidlleCurrent;
        }
        //if (numbLast == numbMidllePrev) array[array.length - 1] = 1;
        //else array[array.length - 1] = 0;
        array[array.length - 1] = (~(numbMidllePrev ^ numbLast) & 1);//закомментировать, если используется if
        day--;
    }
    return array;
}
