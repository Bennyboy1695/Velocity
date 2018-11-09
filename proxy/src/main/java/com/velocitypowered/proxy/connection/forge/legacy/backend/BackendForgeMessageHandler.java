package com.velocitypowered.proxy.connection.forge.legacy.backend;

import com.velocitypowered.proxy.connection.backend.VelocityServerConnection;
import com.velocitypowered.proxy.protocol.packet.PluginMessage;

public interface BackendForgeMessageHandler {
  void handle(PluginMessage message, VelocityServerConnection connection);
}
