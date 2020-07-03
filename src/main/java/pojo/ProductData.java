package pojo;

public class ProductData {


    private String product;
    private String euro;
    private String poundSterlin;
    private String dollar;

    public ProductData(String _product, String _euro, String _poundSterlin, String _dollar)
    {
        this.product=_product;
        this.euro=_euro;
        this.poundSterlin=_poundSterlin;
        this.dollar=_dollar;
    }

    public String getProduct() {
        return product;
    }

    public String getEuro() {
        return euro;
    }

    public String getPoundSterlin() {
        return poundSterlin;
    }

    public String getDollar() {
        return dollar;
    }
}
