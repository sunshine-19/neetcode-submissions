class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_string = new StringBuilder();
        for(String str: strs ){
            encoded_string.append(str.length());
            encoded_string.append("#");
            encoded_string.append(str);
        }
        return encoded_string.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded_string = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            decoded_string.add(str.substring(i, i + length));
            i += length;
        }
        return decoded_string;
    }
}