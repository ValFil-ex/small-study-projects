<?php
/*
Plugin Name: Rentiere
Version: 1.0
Author: Valeriya Filatova
*/

function create_rentier_cpt() {

    $labels = array(
        'name' => _x( 'Rentiere', 'Post Type General Name', 'textdomain' ),
        'singular_name' => _x( 'Rentier', 'Post Type Singular Name', 'textdomain' ),
        'menu_name' => _x( 'Rentiere', 'Admin Menu text', 'textdomain' ),
        'name_admin_bar' => _x( 'Rentier', 'Add New on Toolbar', 'textdomain' ),
        'archives' => __( 'Rentier Archive', 'textdomain' ),
        'attributes' => __( 'Rentier Attribute', 'textdomain' ),
        'parent_item_colon' => __( 'Eltern Rentier:', 'textdomain' ),
        'all_items' => __( 'Alle Rentiere', 'textdomain' ),
        'add_new_item' => __( 'Rentier erstellen', 'textdomain' ),
        'add_new' => __( 'Erstellen', 'textdomain' ),
        'new_item' => __( 'Rentier erstellen', 'textdomain' ),
        'edit_item' => __( 'Bearbeite Rentier', 'textdomain' ),
        'update_item' => __( 'Aktualisiere Rentier', 'textdomain' ),
        'view_item' => __( 'Rentier anschauen', 'textdomain' ),
        'view_items' => __( 'Rentiere anschauen', 'textdomain' ),
        'search_items' => __( 'Suche Rentier', 'textdomain' ),
        'not_found' => __( 'Keine Rentiere gefunden.', 'textdomain' ),
        'not_found_in_trash' => __( 'Keine Rentiere im Papierkorb gefunden.', 'textdomain' ),
        'featured_image' => __( 'Beitragsbild', 'textdomain' ),
        'set_featured_image' => __( 'Beitragsbild festlegen', 'textdomain' ),
        'remove_featured_image' => __( 'Beitragsbild entfernen', 'textdomain' ),
        'use_featured_image' => __( 'Als Beitragsbild verwenden', 'textdomain' ),
        'insert_into_item' => __( 'In Rentier einfügen', 'textdomain' ),
        'uploaded_to_this_item' => __( 'Zu diesem Rentier hochgeladen', 'textdomain' ),
        'items_list' => __( 'Rentiere Liste', 'textdomain' ),
        'items_list_navigation' => __( 'Rentiere Liste Navigation', 'textdomain' ),
        'filter_items_list' => __( 'Filter Rentiere Liste', 'textdomain' ),
        'item_published' => __( 'Rentier veröffentlicht', 'textdomain' ),
        'item_published_privately' => __( 'Rentier privat veröffentlicht', 'textdomain' ),
        'item_reverted_to_draft' => __( 'Rentier als Entwurf gespeichert', 'textdomain' ),
        'item_scheduled' => __( 'Rentier geplant', 'textdomain' ),
        'item_updated' => __( 'Rentier aktualisiert', 'textdomain' ),
    );
    $args = array(
        'label' => __( 'Rentier', 'textdomain' ),
        'description' => __( 'Custom post name Rentier', 'textdomain' ),
        'labels' => $labels,
        'menu_icon' => '',
        'supports' => array('title', 'editor'),
        'taxonomies' => array('nasenfarbe'),
        'public' => true,
        'show_ui' => true,
        'show_in_menu' => true,
        'menu_position' => 5,
        'show_in_admin_bar' => true,
        'show_in_nav_menus' => true,
        'can_export' => true,
        'has_archive' => true,
        'hierarchical' => false,
        'exclude_from_search' => false,
        'show_in_rest' => true,
        'publicly_queryable' => true,
        'capability_type' => 'post',
    );
    register_post_type( 'rentier', $args );

}
add_action( 'init', 'create_rentier_cpt', 0 );

function create_nasenfarbe_tax() {

    $labels = array(
        'name'              => _x( 'Nasenfarben', 'taxonomy general name', 'textdomain' ),
        'singular_name'     => _x( 'Nasenfarbe', 'taxonomy singular name', 'textdomain' ),
        'search_items'      => __( 'Suche Nasenfarben', 'textdomain' ),
        'all_items'         => __( 'Alle Nasenfarben', 'textdomain' ),
        'parent_item'       => __( 'Eltern Nasenfarbe', 'textdomain' ),
        'parent_item_colon' => __( 'Eltern Nasenfarbe:', 'textdomain' ),
        'edit_item'         => __( 'Bearbeite Nasenfarbe', 'textdomain' ),
        'update_item'       => __( 'Aktualisiere Nasenfarbe', 'textdomain' ),
        'add_new_item'      => __( 'Nasenfarbe hinzufügen', 'textdomain' ),
        'new_item_name'     => __( 'Neuer Nasenfarbe Name', 'textdomain' ),
        'menu_name'         => __( 'Nasenfarbe', 'textdomain' ),
    );
    $args = array(
        'labels' => $labels,
        'description' => __( 'Taxonomy for cpt Rentiere', 'textdomain' ),
        'hierarchical' => false,
        'public' => true,
        'publicly_queryable' => true,
        'show_ui' => true,
        'show_in_menu' => true,
        'show_in_nav_menus' => true,
        'show_tagcloud' => true,
        'show_in_quick_edit' => true,
        'show_admin_column' => false,
        'show_in_rest' => true,
    );
    register_taxonomy( 'nasenfarbe', array('rentier'), $args );

}
add_action( 'init', 'create_nasenfarbe_tax' );

function register_animals() {
    register_block_type( __DIR__ );
}
add_action( 'init', 'register_animals' );
