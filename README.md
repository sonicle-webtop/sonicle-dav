# Commons DAV Library

[![License](https://img.shields.io/badge/license-AGPLv3-blue.svg)](https://www.gnu.org/licenses/agpl-3.0.txt)

This library provides client-side implementations capable for communicating with CalDAV and/or CardDAV servers.
Interfaces are built on top of [Sardine](https://github.com/lookfirst/sardine) WebDAV client library.

Network communication follow this specifications:

* CardDAV protocol specifications - RFC 6352 <http://tools.ietf.org/html/rfc6352>
* CalDAV protocol specifications - RFC 4791 <http://tools.ietf.org/html/rfc4791>
* Calendar event format specifications - RFC 5545 <http://tools.ietf.org/html/rfc5545>
* vCard format specification - RFC 2426 <http://tools.ietf.org/html/rfc2426>

This library uses JAXB to process XML responses from the DAV server.
Schema classes are provided from [cdav-connector](https://github.com/Kerio/cdav-connector) distributed under Apache License 2.0.

## Build Instructions

This library uses [Maven](http://maven.apache.org/) as its build tool, and adheres to its convensions.
To build the project: `mvn compile`
To build a JAR: `mvn package`

## License

This is Open Source software released under [AGPLv3](./LICENSE.txt)