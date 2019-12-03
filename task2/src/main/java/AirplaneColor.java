enum AirplaneColor{
    White{
        @Override
        void colorBurnout(int timeAfterPainting) {
            setBurnout(getBurnout()+timeAfterPainting);
        }
    },
    Black{
        @Override
        void colorBurnout(int timeAfterPainting) {
            setBurnout(getBurnout()+timeAfterPainting*2);
        }
    };

    AirplaneColor(){ }

    private int burnout;
    private String colorInRGB;

    public void setColorInRGB(String colorInRGB) {
        String strFormat = "[A-F,0-9]{6}";
        if(colorInRGB.matches(strFormat)) {
            this.colorInRGB = colorInRGB;
        }else{
            this.colorInRGB = "000000";
        }
    }

    AirplaneColor(int burnout, String RGBColor){
        this.burnout=burnout;
        this.colorInRGB = RGBColor;
    }

    abstract void colorBurnout(int timeAfterPainting);

    public int getBurnout() {
        return burnout;
    }

    public String getColorInRGB() {
        return colorInRGB;
    }

    public void setBurnout(int burnout) {
        this.burnout = burnout;
    }

}
