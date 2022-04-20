package net.catenax.semantics.framework.aas.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * View
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-04T18:11:14.812382100+01:00[Europe/Berlin]")


public class View extends Referable  {
  @JsonProperty("embeddedDataSpecifications")
  @Valid
  private List<EmbeddedDataSpecification> embeddedDataSpecifications = null;

  @JsonProperty("semanticId")
  private Reference semanticId = null;

  @JsonProperty("containedElements")
  @Valid
  private List<Reference> containedElements = null;

  public View embeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications) {
    this.embeddedDataSpecifications = embeddedDataSpecifications;
    return this;
  }

  public View addEmbeddedDataSpecificationsItem(EmbeddedDataSpecification embeddedDataSpecificationsItem) {
    if (this.embeddedDataSpecifications == null) {
      this.embeddedDataSpecifications = new ArrayList<>();
    }
    this.embeddedDataSpecifications.add(embeddedDataSpecificationsItem);
    return this;
  }

  /**
   * Get embeddedDataSpecifications
   * @return embeddedDataSpecifications
   **/
  @Schema(description = "")
      @Valid
    public List<EmbeddedDataSpecification> getEmbeddedDataSpecifications() {
    return embeddedDataSpecifications;
  }

  public void setEmbeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications) {
    this.embeddedDataSpecifications = embeddedDataSpecifications;
  }

  public View semanticId(Reference semanticId) {
    this.semanticId = semanticId;
    return this;
  }

  /**
   * Get semanticId
   * @return semanticId
   **/
  @Schema(description = "")
  
    @Valid
    public Reference getSemanticId() {
    return semanticId;
  }

  public void setSemanticId(Reference semanticId) {
    this.semanticId = semanticId;
  }

  public View containedElements(List<Reference> containedElements) {
    this.containedElements = containedElements;
    return this;
  }

  public View addContainedElementsItem(Reference containedElementsItem) {
    if (this.containedElements == null) {
      this.containedElements = new ArrayList<>();
    }
    this.containedElements.add(containedElementsItem);
    return this;
  }

  /**
   * Get containedElements
   * @return containedElements
   **/
  @Schema(description = "")
      @Valid
    public List<Reference> getContainedElements() {
    return containedElements;
  }

  public void setContainedElements(List<Reference> containedElements) {
    this.containedElements = containedElements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    View view = (View) o;
    return Objects.equals(this.embeddedDataSpecifications, view.embeddedDataSpecifications) &&
        Objects.equals(this.semanticId, view.semanticId) &&
        Objects.equals(this.containedElements, view.containedElements) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeddedDataSpecifications, semanticId, containedElements, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class View {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    embeddedDataSpecifications: ").append(toIndentedString(embeddedDataSpecifications)).append("\n");
    sb.append("    semanticId: ").append(toIndentedString(semanticId)).append("\n");
    sb.append("    containedElements: ").append(toIndentedString(containedElements)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
