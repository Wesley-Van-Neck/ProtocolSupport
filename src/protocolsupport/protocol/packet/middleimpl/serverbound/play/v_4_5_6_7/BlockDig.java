package protocolsupport.protocol.packet.middleimpl.serverbound.play.v_4_5_6_7;

import io.netty.buffer.ByteBuf;
import protocolsupport.protocol.packet.middle.serverbound.play.MiddleBlockDig;
import protocolsupport.protocol.serializer.PositionSerializer;

public class BlockDig extends MiddleBlockDig {

	@Override
	public void readFromClientData(ByteBuf clientdata) {
		status = Action.values()[clientdata.readUnsignedByte()];
		position = PositionSerializer.readLegacyPositionB(clientdata);
		face = clientdata.readUnsignedByte();
	}

}
