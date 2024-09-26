# FEEL for Citizen Developers

This document contains the FEEL expressions used in the video "An Introduction to FEEL for Citizen Developers".
You can copy/paste these into the FEEL playground to work with the data. The data set used for these demos is
available here: [spiderman-miles_morales.json](./spiderman-miles_morales.json)

```
{
  "name": data.name,
  "description": data.description,
  "numberOfAvailableComics": data.comics.available
}
```

```
{
  "combinedListOfCreators": flatten(data.events.items.creators.items),
  "onlyWriters": combinedListOfCreators[item.role = "writer"],
  "onlyDistinctWriters": distinct values(onlyWriters),
  "limit5Writers": sublist(onlyDistinctWriters, 1, 5),
  "topCreators": string join(limit5Writers.name, ", ")
}
```

```
{
  "topCreators": string join(
    sublist(
      distinct values(
        flatten(data.events.items.creators.items)[item.role = "writer"]
      ), 1, 5).name, ", "
  )
}
```

```
{
  "topEvents": for event in data.events.items return {
    "eventName": event.title,
    "endedOrContinuing": if event.end != null then "Ended" else "Continuing"
  }
}
```

```
{
  "name": data.name,
  "description": data.description,
  "numberOfAvailableComics": data.comics.available,
  "topCreators": string join(
    sublist(
      distinct values(
        flatten(data.events.items.creators.items)[item.role = "writer"]
      ), 1, 5).name, ", "
  ),
  "topEvents": for event in data.events.items return {
    "eventName": event.title,
    "endedOrContinuing": if event.end != null then "Ended" else "Continuing"
  }
}
```