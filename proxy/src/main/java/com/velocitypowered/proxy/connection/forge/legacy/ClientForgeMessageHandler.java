package com.velocitypowered.proxy.connection.forge.legacy;

import com.velocitypowered.proxy.connection.client.ConnectedPlayer;
import com.velocitypowered.proxy.protocol.packet.PluginMessage;

public interface ClientForgeMessageHandler {
  void handle(PluginMessage message, ConnectedPlayer player);
}
