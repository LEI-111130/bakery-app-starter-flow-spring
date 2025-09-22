package com.vaadin.starter.bakery.test;

import java.util.Locale;
import java.util.Locale.Category;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

/**
 * Classe abstrata de teste que força a execução dos testes
 * no locale Turco ({@code tr-TR}).
 * <p>
 * Esta classe redefine temporariamente o {@link Locale.Category#FORMAT}
 * antes da execução dos testes e restaura o locale original no final.
 * </p>
 */
public abstract class FormattingTest {

    /**
     * Locale original usado antes da alteração para {@code tr-TR}.
     */
    private static Locale locale;

    /**
     * Executado uma vez antes de todos os testes da classe.
     * <p>
     * Guarda o locale atual e altera a categoria
     * {@link Locale.Category#FORMAT} para {@code tr-TR}.
     * </p>
     */
    @BeforeAll
    public static void setUpClass() {
        locale = Locale.getDefault(Category.FORMAT);
        Locale.setDefault(Category.FORMAT, new Locale("tr", "TR"));
    }

    /**
     * Executado uma vez após todos os testes da classe.
     * <p>
     * Restaura o locale original guardado em {@link #locale}.
     * </p>
     */
    @AfterAll
    public static void tearDownClass() {
        Locale.setDefault(Category.FORMAT, locale);
        locale = null;
    }

}
