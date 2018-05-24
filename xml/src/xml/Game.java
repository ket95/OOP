package xml;

import java.util.List;

public class Game {
public Maps map;
public List<Player> lPlayer;
public Game(Maps map, List<Player> lPlayer) {
	super();
	this.map = map;
	this.lPlayer = lPlayer;
}
public Maps getMap() {
	return map;
}
public void setMap(Maps map) {
	this.map = map;
}
public List<Player> getlPlayer() {
	return lPlayer;
}
public void setlPlayer(List<Player> lPlayer) {
	this.lPlayer = lPlayer;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Game [map=");
	builder.append(map);
	builder.append(", lPlayer=");
	builder.append(lPlayer);
	builder.append("]");
	return builder.toString();
}


}
