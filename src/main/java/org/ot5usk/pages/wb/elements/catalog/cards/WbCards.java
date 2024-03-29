package org.ot5usk.pages.wb.elements.catalog.cards;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.pages.wb.WbCardPage;

import static com.codeborne.selenide.Selenide.$x;

public class WbCards {

    private final SelenideElement card = $x("//div[@class='product-card__wrapper']");
    private final SelenideElement addToBasketBtn = $x("//a[contains(@data-link, '/lk/basket')]");
    private final SelenideElement cardName = $x("//article[@data-nm-id][1]//span[@class='product-card__name']");
    private final SelenideElement cardBrand = $x("//article[@data-nm-id][1]//span[@class='product-card__brand']");
    private final SelenideElement newCardPrice = $x("//ins[@class='price__lower-price']");
    private final SelenideElement oldCardPrice = $x("//del");

    public WbCardPage clickToCard() {
        card.click();
        return new WbCardPage();
    }

    public SelenideElement getCard() {
        return card;
    }

    public SelenideElement getAddToBasketBtn() {
        return addToBasketBtn;
    }

    public SelenideElement getCardName() {
        return cardName;
    }

    public SelenideElement getCardBrand() {
        return cardBrand;
    }

    public SelenideElement getNewCardPrice() {
        return newCardPrice;
    }

    public SelenideElement getOldCardPrice() {
        return oldCardPrice;
    }
}
