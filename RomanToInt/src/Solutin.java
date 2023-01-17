public class Solutin {
        public int charToInt(char c)
        {
            if(c == 'I')
                return 1;
            if(c == 'V')
                return 5;
            if(c == 'X')
                return 10;
            if(c == 'L')
                return 50;
            if(c == 'C')
                return 100;
            if(c == 'D')
                return 500;
            if(c == 'M')
                return 1000;

            return -1;
        }

        public int romanToInt(String s)
        {
            int total = 0;
            int s1;
            int s2;
            int i;
            for (i = 0; i < s.length(); i++)
            {
                s1 = charToInt(s.charAt(i)) ;
                if (i + 1 < s.length()) {
                    s2 = charToInt(s.charAt(i+1));
                    if (s1 >= s2) {
                        total = total + s1;
                    } else {
                        total = total - s1;
                    }
                } else
                    total = total + s1;
            }

            return total;
        }
    }

