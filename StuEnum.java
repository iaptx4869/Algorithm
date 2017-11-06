class StuEnum {
    private void calcByEnum(int iNum, int iOff, float fPercent) {
        float fMinDiff = 1.0f, fTmp;
        int iRealNum = 300;
        for (int i = iNum - iOff + 1; i <= iNum + iOff; i++) {
            fTmp = Math.abs(Math.round(i * fPercent) / (float) i - fPercent);
            if (fTmp < fMinDiff) {
                fMinDiff = fTmp;
                iRealNum = i;
            }
        }
        int iJiuYe = Math.round(iRealNum * fPercent);
        System.out.println(iRealNum + "," + iJiuYe + "," + fPercent + "," + (iJiuYe / (float) iRealNum));
    }

    public static void main(String[] args) {
        StuEnum obj = new StuEnum();
        obj.calcByEnum(300, 20, 0.8323f);
    }
}