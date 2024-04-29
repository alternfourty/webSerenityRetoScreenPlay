Feature: Add an Item to the Shopping Cart
  As a user i want to be able to search for an item
  and save it in my shopping cart
  @AddItemToCart
  Scenario: User adds the item the cart
    Given The user is able to access the exito store
    When The user search for the item and clicks the agregar button
    Then The item will be listed on the shopping cart list