package br.com.smartpromos.api.general.response;

import com.google.gson.annotations.SerializedName;



/**
 * Created by Leandro on 13/04/2016.
 */
public class LocalizacaoResponse {

    @SerializedName("id")
    private int id_locale;

    @SerializedName("bairro")
    private String neighborwood;

    @SerializedName("cidade")
    private String city;

    @SerializedName("estado")
    private String state;

    @SerializedName("cep")
    private int zip_code;

    @SerializedName("pais")
    private String country;

    @SerializedName("rua")
    private String address;

    @SerializedName("numero")
    private String number_address;

    @SerializedName("tipo")
    private int type;

    @SerializedName("tipoEndenreco")
    private String addresstype;

    @SerializedName("customer")
    private int customer;

    @SerializedName("msg")
    private MensagemResponse mensagem;

    public LocalizacaoResponse(int id_locale, String neighborwood, String city, String state, int zip_code, String country, String address, String number_address, int type, String addresstype, int customer, MensagemResponse mensagem) {
        this.id_locale = id_locale;
        this.neighborwood = neighborwood;
        this.city = city;
        this.state = state;
        this.zip_code = zip_code;
        this.country = country;
        this.address = address;
        this.number_address = number_address;
        this.type = type;
        this.addresstype = addresstype;
        this.customer = customer;
        this.mensagem = mensagem;
    }

    public int getId_locale() {
        return id_locale;
    }

    public void setId_locale(int id_locale) {
        this.id_locale = id_locale;
    }

    public String getNeighborwood() {
        return neighborwood;
    }

    public void setNeighborwood(String neighborwood) {
        this.neighborwood = neighborwood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip_code() {
        return zip_code;
    }

    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber_address() {
        return number_address;
    }

    public void setNumber_address(String number_address) {
        this.number_address = number_address;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAddresstype() {
        return addresstype;
    }

    public void setAddresstype(String addresstype) {
        this.addresstype = addresstype;
    }

    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public MensagemResponse getMensagem() {
        return mensagem;
    }

    public void setMensagem(MensagemResponse mensagem) {
        this.mensagem = mensagem;
    }
}
