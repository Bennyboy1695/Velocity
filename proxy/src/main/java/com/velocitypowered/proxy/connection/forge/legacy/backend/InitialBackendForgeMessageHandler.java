package com.velocitypowered.proxy.connection.forge.legacy.backend;

import com.velocitypowered.proxy.connection.backend.VelocityServerConnection;
import com.velocitypowered.proxy.connection.forge.ForgeConstants;
import com.velocitypowered.proxy.protocol.packet.PluginMessage;

public class InitialBackendForgeMessageHandler implements BackendForgeMessageHandler {

  @Override
  public void handle(PluginMessage message, VelocityServerConnection connection) {
    if (message.getChannel().equals(ForgeConstants.FORGE_LEGACY_HANDSHAKE_CHANNEL)
        && message.getData()[0] == 0) {
      // This is a Forge server.
      connection.getConnection().setLegacyForge(true);
      return;
    }
  }
}
