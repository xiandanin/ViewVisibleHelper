# ViewVisibleLevel
用来计算View可见程度，还提供了OnScrollListener，可用于列表自动播放

### RecyclerViewVisibleHelper
```
RecyclerViewVisibleHelper mHelper = new RecyclerViewVisibleHelper(callback);
mHelper.getLocalVisibleInfo(recyclerView);
```

### RecyclerView
```
rv.addOnScrollListener(new OnAutoPlayScrollListener(
        itemView -> itemView.findViewById(R.id.video)) {
    @Override
    public void startPlay(View itemView) {
        StandardGSYVideoPlayer player = itemView.findViewById(R.id.video);
        if (player != null && player.getCurrentState() != GSYVideoView.CURRENT_STATE_PLAYING) {
            player.setVisibility(View.VISIBLE);
            player.startPlayLogic();
        }
    }
});
```
