package donald.com.healthmanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;

import at.blogc.android.views.ExpandableTextView;

public class Typhoid extends AppCompatActivity {

    private ExpandableTextView tvCause, tvSigns, tvDiagnosis, tvTreatment, tvPrevention;
    private Button btnCause, btnSigns, btnDiagnosis, btnTreatment, btnPrevention;

    String TAG = "Typhoid";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typhoid);


        tvCause = findViewById(R.id.expandableTextViewCauses);
        tvSigns = findViewById(R.id.expandableTextViewSign);
        tvDiagnosis = findViewById(R.id.expandableTextViewDiagnosis);
        tvTreatment = findViewById(R.id.expandableTextViewTreatment);
        tvPrevention = findViewById(R.id.expandableTextViewPrevention);

        btnCause = findViewById(R.id.btnCauses);
        btnSigns = findViewById(R.id.btnSigns);
        btnDiagnosis = findViewById(R.id.btnDiagnosis);
        btnTreatment = findViewById(R.id.btnTreatment);
        btnPrevention = findViewById(R.id.btnPrevention);

        //final ExpandableTextView expandableTextView = (ExpandableTextView) this.findViewById(R.id.expandableTextView);
        //final Button buttonToggle = (Button) this.findViewById(R.id.button_toggle);

// set animation duration via code, but preferable in your layout files by using the animation_duration attribute
        tvCause.setAnimationDuration(750L);
        tvSigns.setAnimationDuration(750L);
        tvDiagnosis.setAnimationDuration(750L);
        tvTreatment.setAnimationDuration(750L);
        tvPrevention.setAnimationDuration(750L);

        // set interpolators for both expanding and collapsing animations
        tvCause.setInterpolator(new OvershootInterpolator());
        tvSigns.setInterpolator(new OvershootInterpolator());
        tvDiagnosis.setInterpolator(new OvershootInterpolator());
        tvTreatment.setInterpolator(new OvershootInterpolator());
        tvPrevention.setInterpolator(new OvershootInterpolator());

// or set them separately
        tvCause.setExpandInterpolator(new OvershootInterpolator());
        tvCause.setCollapseInterpolator(new OvershootInterpolator());
        tvSigns.setExpandInterpolator(new OvershootInterpolator());
        tvSigns.setCollapseInterpolator(new OvershootInterpolator());
        tvDiagnosis.setExpandInterpolator(new OvershootInterpolator());
        tvDiagnosis.setCollapseInterpolator(new OvershootInterpolator());
        tvTreatment.setExpandInterpolator(new OvershootInterpolator());
        tvTreatment.setCollapseInterpolator(new OvershootInterpolator());
        tvPrevention.setExpandInterpolator(new OvershootInterpolator());
        tvPrevention.setCollapseInterpolator(new OvershootInterpolator());


// but, you can also do the checks yourself
        btnCause.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(final View v)
            {
                if (tvCause.isExpanded())
                {
                    tvCause.collapse();
                    btnCause.setBackgroundResource(R.drawable.expand);
                }
                else
                {
                    tvCause.expand();
                    btnCause.setBackgroundResource(R.drawable.colapes);
                }
            }
        });

        btnSigns.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(final View v)
            {
                if (tvSigns.isExpanded())
                {
                    tvSigns.collapse();
                    btnSigns.setBackgroundResource(R.drawable.expand);
                }
                else
                {
                    tvSigns.expand();
                    btnSigns.setBackgroundResource(R.drawable.colapes);
                }
            }
        });

        btnDiagnosis.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(final View v)
            {
                if (tvDiagnosis.isExpanded())
                {
                    tvDiagnosis.collapse();
                    btnDiagnosis.setBackgroundResource(R.drawable.expand);
                }
                else
                {
                    tvDiagnosis.expand();
                    btnDiagnosis.setBackgroundResource(R.drawable.colapes);
                }
            }
        });

        btnTreatment.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(final View v)
            {
                if (tvTreatment.isExpanded())
                {
                    tvTreatment.collapse();
                    btnTreatment.setBackgroundResource(R.drawable.expand);
                }
                else
                {
                    tvTreatment.expand();
                    btnTreatment.setBackgroundResource(R.drawable.colapes);
                }
            }
        });

        btnPrevention.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(final View v)
            {
                if (tvPrevention.isExpanded())
                {
                    tvPrevention.collapse();
                    btnPrevention.setBackgroundResource(R.drawable.expand);
                }
                else
                {
                    tvPrevention.expand();
                    btnPrevention.setBackgroundResource(R.drawable.colapes);
                }
            }
        });


    }
}
