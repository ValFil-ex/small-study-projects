( function( blocks, element, blockEditor ) {
    var el = element.createElement;
    var useBlockProps = blockEditor.useBlockProps;

    let $poem = '"Twas the night before Christmas, when all through the house\nNot a creature was stirring, not even a mouse; \nThe stockings were hung by the chimney with care, \nIn hopes that St. Nicholas soon would be there;\nThe children were nestled all snug in their beds; \nWhile visions of sugar-plums danced in their heads; \nAnd mamma in her kerchief, and I in my cap, \nHad just settled our brains for a long winter\'s nap, \nWhen out on the lawn there arose such a clatter, \nI sprang from my bed to see what was the matter. \nAway to the window I flew like a flash, \nTore open the shutters and threw up the sash. \nThe moon on the breast of the new-fallen snow, \nGave a lustre of midday to objects below, \nWhen what to my wondering eyes did appear, \nBut a miniature sleigh and eight tiny rein-deer, \nWith a little old driver so lively and quick, \nI knew in a moment he must be St. Nick. \nMore rapid than eagles his coursers they came, \nAnd he whistled, and shouted, and called them by name: \n"Now, Dasher! now, Dancer! now Prancer and Vixen! \nOn, Comet! on, Cupid! on, Donner and Blitzen! \nTo the top of the porch! to the top of the wall! \nNow dash away! dash away! dash away all!" \nAs leaves that before the wild hurricane fly, \nWhen they meet with an obstacle, mount to the sky; \nSo up to the housetop the coursers they flew \nWith the sleigh full of toys, and St. Nicholas too— \nAnd then, in a twinkling, I heard on the roof \nThe prancing and pawing of each little hoof. \nAs I drew in my head, and was turning around, \nDown the chimney St. Nicholas came with a bound. \nHe was dressed all in fur, from his head to his foot, \nAnd his clothes were all tarnished with ashes and soot; \nA bundle of toys he had flung on his back, \nAnd he looked like a pedler just opening his pack. \nHis eyes—how they twinkled! his dimples, how merry! \nHis cheeks were like roses, his nose like a cherry! \nHis droll little mouth was drawn up like a bow, \nAnd the beard on his chin was as white as the snow; \nThe stump of a pipe he held tight in his teeth, \nAnd the smoke, it encircled his head like a wreath; \nHe had a broad face and a little round belly \nThat shook when he laughed, like a bowl full of jelly.\nHe was chubby and plump, a right jolly old elf, \nAnd I laughed when I saw him, in spite of myself; \nA wink of his eye and a twist of his head \nSoon gave me to know I had nothing to dread; \nHe spoke not a word, but went straight to his work, \nAnd filled all the stockings; then turned with a jerk, \nAnd laying his finger aside of his nose, \nAnd giving a nod, up the chimney he rose; \nHe sprang to his sleigh, to his team gave a whistle,\nAnd away they all flew like the down of a thistle.\nBut I heard him exclaim, ere he drove out of sight— \n“Happy Christmas to all, and to all a good night!"\n\nClement C. Moore - 1823.';

    blocks.registerBlockType( 'rentiere/reindeer-poem', {
        edit: function() {
            return el(
                'pre',
                useBlockProps(),
                $poem
            );
        },
        save: function() {
            return el(
                'pre',
                useBlockProps.save(),
                $poem
            );
        },
    } );
}( window.wp.blocks, window.wp.element, window.wp.blockEditor ) );
