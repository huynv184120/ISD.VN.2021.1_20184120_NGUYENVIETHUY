package controller;

/**
 *this is document.
 *
 * @author KhuongIT
 *
 */
public class PlaceRushOrderController extends PlaceOrderController {
  @Override
  public boolean validateAddress(String addr) {
    return false;
  }

  public boolean validateScheduledDate(String date) {
    return false;
  }
}
