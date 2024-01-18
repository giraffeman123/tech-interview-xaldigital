package xaldigital.mx.webapp.service.entity;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AirlineName",
    "TotalFlights"
})
@Generated("jsonschema2pojo")
public class Airline {

    @JsonProperty("AirlineName")
    private String AirlineName;
    @JsonProperty("TotalFlights")
    private Integer TotalFlights;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("AirlineName")
    public String getAirlineName() {
        return AirlineName;
    }

    @JsonProperty("AirlineName")
    public void setAirlineName(String AirlineName) {
        this.AirlineName = AirlineName;
    }

    @JsonProperty("TotalFlights")
    public Integer getTotalFlights() {
        return TotalFlights;
    }

    @JsonProperty("TotalFlights")
    public void setTotalFlights(Integer TotalFlights) {
        this.TotalFlights = TotalFlights;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}