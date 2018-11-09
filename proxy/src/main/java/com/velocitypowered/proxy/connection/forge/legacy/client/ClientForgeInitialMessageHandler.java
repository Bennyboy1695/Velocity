package com.velocitypowered.proxy.connection.forge.legacy.client;

import com.velocitypowered.proxy.connection.client.ConnectedPlayer;
import com.velocitypowered.proxy.connection.forge.ForgeConstants;
import com.velocitypowered.proxy.connection.forge.legacy.ClientForgeMessageHandler;
import com.velocitypowered.proxy.protocol.packet.PluginMessage;

/**
 * Handles ClientHello.
 */
public class ClientForgeInitialMessageHandler implements ClientForgeMessageHandler {

  @Override
  public void handle(PluginMessage message, ConnectedPlayer player) {
    if (message.getChannel().equals(ForgeConstants.FORGE_LEGACY_HANDSHAKE_CHANNEL)
        && message.getData()[0] == 1) {
      // We have a Forge client.

    }
  }
}
