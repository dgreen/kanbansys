/*
 * Author: David Green <DGreen@uab.edu>
 * Assignment:  kanbansys - EE333 Summer 2021
 *
 * Credits:  (if any for sections of code)
 */
package edu.uab.dgreen.kanbansys;

/** Describe a StringField which is a field that holds a string */
public class StringField extends Field {

  private String text; // contents of field

  public StringField(String name, String text) {
    super(name, "string");
    this.text = (text == null) ? "unknown" : text;
  }

  /**
   * Returns a string representation of the field's value (given it is a string, the value is
   * returned.
   *
   * @return the value of the field (text string)
   */
  @Override
  public String toString() {
    return text;
  }

  /**
   * Do a compareTo on the value, the parameter f is already handled if it is null or not the same
   * type by the superClass.
   *
   * @param f the other stringField being compared to
   * @return negative (before), zero (equal), positive after
   */
  @Override
  public int valueCompareTo(Field f) {
    return text.compareTo(((StringField) f).text);
  }

  @Override
  public Field newField(Object newValue) {
    return new StringField(this.getName(), (String) newValue);
  }
}