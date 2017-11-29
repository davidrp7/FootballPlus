package com.example.k11.footballplus.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.k11.footballplus.Models.Reservations;
import com.example.k11.footballplus.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k11 on 29/11/17.
 */

public class ReservationsFragmentAdapter extends RecyclerView.Adapter<ReservationsFragmentAdapter.ViewHolder> {

    List<Reservations> reservationsList = new ArrayList<>();
    Context context;

    public ReservationsFragmentAdapter(List<Reservations> reservationsList, Context context) {
        this.reservationsList = reservationsList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_reservation, parent, false);
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        holder.txtNameFieldItemReservarion.setText(reservationsList.get(position).getNameCampReservation());
        holder.txtHourStartItemReservarion.setText(reservationsList.get(position).getStartTimeReservation());
        holder.txtHourEndItemReservarion.setText(reservationsList.get(position).getEndTimeResrvation());
        holder.txtDateItemReservarion.setText(reservationsList.get(position).getDateReservation());
        holder.txtAddressItemReservarion.setText(reservationsList.get(position).getAddresCampReservation());
        holder.txtPhoneItemReservarion.setText(Integer.toString(reservationsList.get(position).getPhoneCampReservation()));

    }

    @Override
    public int getItemCount() {
        return reservationsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNameFieldItemReservarion, txtHourStartItemReservarion,
                txtHourEndItemReservarion, txtAddressItemReservarion,
                txtPhoneItemReservarion, txtDateItemReservarion;

        Button txtRemoveItemReservarion;

        public ViewHolder(View item) {
            super(item);
            txtNameFieldItemReservarion = (TextView) item.findViewById(R.id.txtNameFieldItemReservarion);
            txtHourStartItemReservarion = (TextView) item.findViewById(R.id.txtHourStartItemReservarion);
            txtHourEndItemReservarion = (TextView) item.findViewById(R.id.txtHourEndItemReservarion);
            txtAddressItemReservarion = (TextView) item.findViewById(R.id.txtAddressItemReservarion);
            txtPhoneItemReservarion = (TextView) item.findViewById(R.id.txtPhoneItemReservarion);
            txtRemoveItemReservarion = (Button) item.findViewById(R.id.txtRemoveItemReservarion);
            txtDateItemReservarion = (TextView) item.findViewById(R.id.txtDateItemReservarion);
        }


    }

}