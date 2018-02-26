class DispUnicode {
    private void queryCoding(String sArg) {
        System.out.println(sArg);
        for (int i = 0; i < sArg.length(); i++) {
            char ch = sArg.charAt(i);
            if (ch < 19968 || ch > 40869)
                continue;
            System.out.print((int) ch + " ");
        }
    }
    public static void main(String[] args) {
        DispUnicode obj = new DispUnicode();
        obj.queryCoding("字符串");
    }
}