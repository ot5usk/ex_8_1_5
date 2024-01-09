package org.ot5usk.steps.wb.pages_steps.elements_steps.catalog.cards;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.wb.elements.catalog.cards.WbCards;
import org.ot5usk.steps.wb.pages_steps.elements_steps.base.WbBaseElementsSteps;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.actions;

public class WbCardsSteps extends WbBaseElementsSteps {

    private final WbCards cards;

    public WbCardsSteps(WbCards cards) {
        this.cards = cards;
    }

    @Step("Нажатие кнопки добавления товара в корзину")
    public void clickAddToBasketBtn() {
        moveToCard();
        getAddToBasketBtn().shouldBe(appear).click();
    }

    @Step("Наведение на карточку товара")
    public void moveToCard() {
        actions().moveToElement(getCard().shouldBe(appear)).build().perform();
    }

    public SelenideElement getCard() {
        return cards.getCard();
    }

    public SelenideElement getAddToBasketBtn() {
        return cards.getAddToBasketBtn();
    }

    public SelenideElement getCardBrand() {
        return cards.getCardBrand();
    }

    public SelenideElement getNewCardPrice() {
        return cards.getNewCardPrice();
    }

    public SelenideElement getOldCardPrice() {
        return cards.getOldCardPrice();
    }
}