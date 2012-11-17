package me.bhsgoclub.warpedworld;

import CraftPlayer;
import EntityPlayer;
import MobEffect;

import org.bukkit.plugin.*;
import org.bukkit.plugin.java.JavaPlugin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public int time = 30;
public int strength = 10;

public void doEffect(EntityPlayer player, int id, int time, int strength) {
	player.addEffect(new MobEffect(id, time * 20, strength));
	
	
}
public void doEffect(EntityPlayer player, int id, float time, int strength) {

	player.addEffect(new MobEffect(id, (int)time * 20, strength));
	

	
public boolean effectPlayer(Player sender, String commandLabel, int amount, int ss)
{
	if (amount>0)
		strength = amount;
	
	if (ss>0)
		time = ss;
	
	EntityPlayer eplayer = ((CraftPlayer) (Player)sender).getHandle();
	        if (commandLabel.equalsIgnoreCase("speedup")) {
	            doEffect(eplayer, 1, time, strength);
				return true;
	        } else if (commandLabel.equalsIgnoreCase("speeddown")) {
	            doEffect(eplayer, 2, time, strength);
				return true;
	        } else if (commandLabel.equalsIgnoreCase("digup")) {
	            doEffect(eplayer, 3, time, strength);
				return true;
	        } else if (commandLabel.equalsIgnoreCase("digdown")) {
	            doEffect(eplayer, 4, time, strength);
				return true;
	        } else if (commandLabel.equalsIgnoreCase("damageboost")) {
	            doEffect(eplayer, 5, time, strength);
				return true;
	        } else if (commandLabel.equalsIgnoreCase("heal")) {
	            doEffect(eplayer, 6, time, strength);
				return true;
	        } else if (commandLabel.equalsIgnoreCase("harm") ) {
	            doEffect(eplayer, 7, time, strength);
				return true;
	        } else if (commandLabel.equalsIgnoreCase("jump")) {
               doEffect(eplayer, 8, time, strength);
				return true;
	        } else if (commandLabel.equalsIgnoreCase("confusion")) {
	            doEffect(eplayer, 9, time, strength);
				return true;
	        } else if (commandLabel.equalsIgnoreCase("regen")) {
	            doEffect(eplayer, 10, time, strength);
				return true;
	        } else if (commandLabel.equalsIgnoreCase("resist")) {
	            doEffect(eplayer, 11, time, strength);
				return true;
	        } else if (commandLabel.equalsIgnoreCase("fireresist")) {
	            doEffect(eplayer, 12, time, strength);
				return true;
	        } else if (commandLabel.equalsIgnoreCase("waterbreath") ) {
	            doEffect(eplayer, 13, time, strength);
				return true;
	        } else if (commandLabel.equalsIgnoreCase("invisible")) {
	            doEffect(eplayer, 14, time, strength);
				return true;
	        } else if (commandLabel.equalsIgnoreCase("blindness")) {
	            doEffect(eplayer, 15, time, strength);
				return true;
	        } else if (commandLabel.equalsIgnoreCase("nightvision")) {
	            doEffect(eplayer, 16, time, strength);
				return true;
	        } else if (commandLabel.equalsIgnoreCase("hunger")) {
	            doEffect(eplayer, 17, time, strength);
				return true;
	        } else if (commandLabel.equalsIgnoreCase("weakness")) {
	            doEffect(eplayer, 18, time, strength);
				return true;
	        } else if (commandLabel.equalsIgnoreCase("poison")) {
	            doEffect(eplayer, 19, time, strength);
				return true;
	        }
			return false; 
			}
}