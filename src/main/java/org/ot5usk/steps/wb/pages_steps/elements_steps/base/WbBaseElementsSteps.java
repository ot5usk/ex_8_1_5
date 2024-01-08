package org.ot5usk.steps.wb.pages_steps.elements_steps.base;

import io.qameta.allure.Step;
import org.ot5usk.pages.wb.elements.base.WbBaseElements;
import org.ot5usk.steps.wb.pages_steps.basket.WbBasketPageSteps;
import org.ot5usk.steps.wb.pages_steps.elements_steps.base.nav_bar_menu.WbNavBarMenuSteps;
import org.ot5usk.steps.wb.pages_steps.elements_steps.base.search_bar.WbSearchBarSteps;

public class WbBaseElementsSteps {

    private final WbBaseElements baseElements;

    public WbBaseElementsSteps() {
        this.baseElements = new WbBaseElements();
    }

    @Step("Нажатие на поисковую строку")
    public WbSearchBarSteps clickOnTheSearchBar() {
        baseElements.clickOnTheSearchBar();
        return new WbSearchBarSteps();
    }

    @Step("Нажатие на кнопку открытия меню навигационных фильтров")
    public WbNavBarMenuSteps clickNavBarBtn() {
        baseElements.clickNavBarBtn();
        return new WbNavBarMenuSteps();
    }

    @Step("Нажатие кнопки перехода в Коризну")
    public void clickGoToBasketBtn() {
        baseElements.clickGoToBasketBtn();
        new WbBasketPageSteps();
    }
}