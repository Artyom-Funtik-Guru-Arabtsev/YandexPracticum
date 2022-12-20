package kinotheatre;

import java.util.List;

public class Calculator {

    private Calculator() {}

    public static double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        int sum = 0;
        for (MediaItem mediaItem: mediaItems){
            if (mediaItem instanceof Movie) sum+= mediaItem.getRuntime();
            else {
                Series series = (Series) mediaItem;
                sum+=series.getSeriesCount() * series.getRuntime();
            }
        }
        return sum/(24.0*60);
    }

}