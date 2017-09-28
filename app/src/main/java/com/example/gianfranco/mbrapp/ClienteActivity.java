package com.example.gianfranco.mbrapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class ClienteActivity extends AppCompatActivity {
private DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);

        // Set DrawerLayout
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        // Set drawer toggle icon
        final ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setHomeAsUpIndicator(R.drawable.ic_menu);
            ab.setDisplayHomeAsUpEnabled(true);
        }
int rol=1;
        // Set NavigationItemSelectedListener
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                // Do action by menu item id
                switch (menuItem.getItemId()){
                    case R.id.nav_home:
                        Toast.makeText(ClienteActivity.this, "Go home...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_settings:
                        Toast.makeText(ClienteActivity.this, "Go settings...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_logout:
                        Intent ii = new Intent(ClienteActivity.this,MainActivity.class);
                        startActivity(ii);
                        break;
                    case R.id.nav_registrar_ticket:
                        Toast.makeText(ClienteActivity.this, "Do register ticket...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_consultar_ticket:
                        Toast.makeText(ClienteActivity.this, "Do check ticket...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_consultar_todos_ticket:
                        Toast.makeText(ClienteActivity.this, "Do check all ticket...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_asignar_ticket_tecnico:
                        Toast.makeText(ClienteActivity.this, "Do assign ticket to technician...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_reporte_ticket:
                        Toast.makeText(ClienteActivity.this, "Do tickets report...", Toast.LENGTH_SHORT).show();
                        break;

                }

                // Close drawer
                drawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }
        });
switch (rol){
    case 1:
        navigationView.getMenu().setGroupVisible(R.id.group_nav_cliente, true);
        navigationView.getMenu().setGroupVisible(R.id.group_nav_supervisor, false);
}

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: // Option open drawer
                if(!drawerLayout.isDrawerOpen(GravityCompat.START))
                    drawerLayout.openDrawer(GravityCompat.START);   // Open drawer
                else
                    drawerLayout.closeDrawer(GravityCompat.START);    // Close drawer
                return true;
        }
        return super.onOptionsItemSelected(item);

    }



}


