package com.tastingspace.tastingprocess;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.xml.bind.annotation.XmlRootElement
public class RecipeDescription implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer recipeId;
	private java.lang.String recipeName;
	private java.lang.Integer recipeSpiciness;

	public RecipeDescription() {
	}

	public java.lang.Integer getRecipeId() {
		return this.recipeId;
	}

	public void setRecipeId(java.lang.Integer recipeId) {
		this.recipeId = recipeId;
	}

	public java.lang.String getRecipeName() {
		return this.recipeName;
	}

	public void setRecipeName(java.lang.String recipeName) {
		this.recipeName = recipeName;
	}

	public java.lang.Integer getRecipeSpiciness() {
		return this.recipeSpiciness;
	}

	public void setRecipeSpiciness(java.lang.Integer recipeSpiciness) {
		this.recipeSpiciness = recipeSpiciness;
	}

	public RecipeDescription(java.lang.Integer recipeId,
			java.lang.String recipeName, java.lang.Integer recipeSpiciness) {
		this.recipeId = recipeId;
		this.recipeName = recipeName;
		this.recipeSpiciness = recipeSpiciness;
	}

}