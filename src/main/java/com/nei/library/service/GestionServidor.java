package com.nei.library.service;

import com.nei.library.model.PerfilJugador;

import java.util.*;

public class GestionServidor {
    private final Map<UUID, PerfilJugador> usuarios = new HashMap<>();
    private final List<String> Historial = new ArrayList<>();
}


