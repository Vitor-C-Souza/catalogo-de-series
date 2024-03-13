package br.com.project.catalogodeseries.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
