<?php



function enqueue_parent_styles() {
    wp_enqueue_style( 'twentynineteen', get_template_directory_uri() . '/style.css' );

    if(is_tax('nasenfarbe', 'rot')){
        wp_enqueue_style( 'child_handler',
            get_stylesheet_directory_uri() . '/nasenfarbe.css',
            array('twentynineteen')
        );

    }else{
        wp_enqueue_style( 'child_handler',
            get_stylesheet_directory_uri() . '/style.css',
            array('twentynineteen')
        );
    }

}

add_action( 'wp_enqueue_scripts', 'enqueue_parent_styles' );




?>
