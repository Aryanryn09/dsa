import org.w3c.dom.ls.LSOutput;

public class findceilingcharac {
            public static void main(String[] args) {
                char [] arr ={'a','b','j','l','n'};
                char ans = ceilingchar(arr,'k');
                System.out.println(ans );
            }

static char ceilingchar(char[] arr ,char target ){
                int  s =0;
                int  e =arr.length-1;
                while(s<=e){
                    int mid= s+(e-s)/2;
                            if(arr[mid]>target){
                        e=mid-1;
                    }
                    else{
                        s=mid+1;
                    }
                }
return arr[s % arr.length];

}
}
