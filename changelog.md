Fixes
- Display collector now receives push updates from any display source (e.g. modded sources like navigation tables), not only belt tunnels
- Display collector registers its source correctly on placement instead of requiring a world reload
- Display collector now polls its source every 10 ticks by default (configurable via displayCollectorPollTicks) instead of the 100-tick display link default
- Redstone signals no longer silently pause the display collector (restore the old display-link behaviour with displayCollectorRedstonePause)
- Fixed a crash on dedicated servers caused by a mixin referencing client-only code
- Expression gauge no longer truncates saved expressions to 32 characters when reopening its screen
- String gauge no longer truncates saved regex/replacement/join text to 32 characters when reopening its screen
