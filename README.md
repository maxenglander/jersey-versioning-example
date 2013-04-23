# Jersey Versioning Example

Example of how to version resources in Jersey.

## Request resources

### V1

    curl -H "Accept: application/vnd.musicstore-v1+json" http://localhost:8080/track/1

### V2

    curl -H "Accept: application/vnd.musicstore-v2+json" http://localhost:8080/track/1
